package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }
    @Override
    public Neighbour getNeighbourById(int id) {
        return neighbours.get(id);
    }
    @Override
    public void createFavNeighbour(Neighbour neighbour){
        neighbours.get(neighbours.indexOf(neighbour)).setFavoriteNeighbour(!neighbour.isFavoriteNeighbour());}

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }

    public List<Neighbour> getFavoritesNeighbours(){
        List<Neighbour> favoritesNeighbours = new ArrayList<>();
        for (Neighbour n : neighbours) {
            if (n.isFavoriteNeighbour())
                favoritesNeighbours.add(n);
        }
        return favoritesNeighbours;
    }

    @Override
    public void removeFavNeighbour(Neighbour neighbour) {
            neighbours.get(neighbours.indexOf(neighbour)).setFavoriteNeighbour(false);
    }


}
