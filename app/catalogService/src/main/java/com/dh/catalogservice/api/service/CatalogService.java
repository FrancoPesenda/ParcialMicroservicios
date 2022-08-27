package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.dto.Catalog;

public interface CatalogService {

    Catalog findCatalogByGenre(String genre);
}
