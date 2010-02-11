package org.inbio.m3s.web.controller.dispatcher;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.inbio.m3s.dao.core.MediaDAO;
import org.inbio.m3s.dto.lite.MediaLite;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 
 * @author jgutierrez
 * 
 */
public class VideoController extends AbstractController {

	// constantes
	private String temporalFilesPath; // ${temporalFilesPath}

	private String mediaFilesPath; // ${mediaFilesPath}

	private String bigMediaFolder; // ${bigMediaFolder}

	private MediaDAO mediaDAO;

	/*
	 * Este servlet ataja las peticiones de videos type=4.
	 * 
	 * Los parametros que el servlet soporta son: id= video ID
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal
	 * (javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		String mediaAddress;
		
		Integer videoId = Integer.valueOf(httpServletRequest.getParameter("id"));
		MediaLite mediaLite = mediaDAO.getMediaLite(videoId);

		// Is Visible?
		if (mediaLite.getIsPublic() == 'Y')
			mediaAddress = getPath(videoId, mediaLite.getCreationDate().toString());
		else {
			logger.error("image with id=" + videoId + " isn't visible");
			mediaAddress = temporalFilesPath + "unavailable.png";
		}

		// starting the delivering of the image

		ServletOutputStream out = httpServletResponse.getOutputStream(); // binary
																																			// output
		int contentLength = 0;
		BufferedInputStream input = null;

		// Open image file.
		// Prepare file object.
		File file = new File(mediaAddress);
		input = new BufferedInputStream(new FileInputStream(file));
		contentLength = input.available();

		// has to be gotten from the fileMiMEType metadata value
		httpServletResponse.setContentType("video/x-flv");

		// Write file contents to response.
		while (contentLength-- > 0) {
			out.write(input.read());
		}

		out.flush();
		out.close();

		return null;
	}

	/**
	 * Creates the address where the video should be
	 * 
	 * @param imageId
	 * @return the real path of the image on the file system
	 */
	private String getPath(Integer imageId, String imageCreationDate) throws IllegalArgumentException {

		String path = mediaFilesPath + File.separator + bigMediaFolder;
		
		// creation date folder
		path = path.concat(File.separator + imageCreationDate);

		// adds the id of the media
		path = path.concat(File.separator + imageId.toString());

		// adds the extention of the media file
		// FIXME: needs to work with DB conection
		// fileExtension = MultimediaDAO.getFileExtension(imageId);
		path = path.concat("." + "flv");

		return path;

	}

	/**
	 * @return the temporalFilesPath
	 */
	public String getTemporalFilesPath() {
		return temporalFilesPath;
	}

	/**
	 * @param temporalFilesPath the temporalFilesPath to set
	 */
	public void setTemporalFilesPath(String temporalFilesPath) {
		this.temporalFilesPath = temporalFilesPath;
	}

	/**
	 * @return the mediaFilesPath
	 */
	public String getMediaFilesPath() {
		return mediaFilesPath;
	}

	/**
	 * @param mediaFilesPath the mediaFilesPath to set
	 */
	public void setMediaFilesPath(String mediaFilesPath) {
		this.mediaFilesPath = mediaFilesPath;
	}

	/**
	 * @return the bigMediaFolder
	 */
	public String getBigMediaFolder() {
		return bigMediaFolder;
	}

	/**
	 * @param bigMediaFolder the bigMediaFolder to set
	 */
	public void setBigMediaFolder(String bigMediaFolder) {
		this.bigMediaFolder = bigMediaFolder;
	}

	/**
	 * @return the mediaDAO
	 */
	public MediaDAO getMediaDAO() {
		return mediaDAO;
	}

	/**
	 * @param mediaDAO the mediaDAO to set
	 */
	public void setMediaDAO(MediaDAO mediaDAO) {
		this.mediaDAO = mediaDAO;
	}


}