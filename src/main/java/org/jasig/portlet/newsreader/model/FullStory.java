package org.jasig.portlet.newsreader.model;

import org.jasig.portlet.newsreader.adapter.NewsException;

public interface FullStory {
	String getFullStory() throws NewsException;
}
