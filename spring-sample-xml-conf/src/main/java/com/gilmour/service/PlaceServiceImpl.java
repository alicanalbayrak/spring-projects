package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Place;
import com.gilmour.repository.IPlaceRepository;

/**
 * Created by alicana on 03/03/2017.
 */
public class PlaceServiceImpl implements IPlaceService {

	private final IPlaceRepository placeRepository;

	public PlaceServiceImpl(IPlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}

	@Override
	public List<Place> listAllPlaces() {
		return placeRepository.getAllPlaces();
	}
}
