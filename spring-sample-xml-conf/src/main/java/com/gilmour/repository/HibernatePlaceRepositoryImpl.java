package com.gilmour.repository;

import java.util.ArrayList;
import java.util.List;

import com.gilmour.model.Place;

/**
 * Created by alicana on 03/03/2017.
 */
public class HibernatePlaceRepositoryImpl implements IPlaceRepository {
	@Override
	public List<Place> getAllPlaces() {
		List<Place> placeList = new ArrayList<>();

		Place place = new Place();
		place.setAddress("Ankara/Çankaya");

		placeList.add(place);

		return placeList;

	}
}
