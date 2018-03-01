package edu.cnm.deepdive.imagesearch.API.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class SearchResponse {

  public ArrayList<Item> getItems() {
    return items;
  }

  private class RequestData {
    private String title = null;
    private String totalResults = null;
    private int count = 0;
    private int startIndex = 0;

  }
  public class Item {
    private String title = null;
    private String link = null;

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getLink() {
      return link;
    }

    public void setLink(String link) {
      this.link = link;
    }
  }

  private RequestData request = null;
  private RequestData nextPage = null;
  private ArrayList<Item> items = null;



}
