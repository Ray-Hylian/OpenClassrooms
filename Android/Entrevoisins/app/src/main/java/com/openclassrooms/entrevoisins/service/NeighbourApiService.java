package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void deleteNeighbour(Neighbour neighbour);

    /**
     * Create a neighbour, fav or not
     * @param neighbour
     */
    void createNeighbour(Neighbour neighbour);
    Neighbour getNeighbourById(int id);

    void createFavNeighbour(Neighbour neighbour);
    List<Neighbour> getFavoritesNeighbours();

    void removeFavNeighbour(Neighbour neighbour);

}
