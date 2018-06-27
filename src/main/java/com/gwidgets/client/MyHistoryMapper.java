package com.gwidgets.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwidgets.client.presenters.LoginPlace;
import com.gwidgets.client.presenters.MainPagePlace;

@WithTokenizers({ LoginPlace.Tokenizer.class, MainPagePlace.Tokenizer.class })
public interface MyHistoryMapper extends PlaceHistoryMapper {

}

