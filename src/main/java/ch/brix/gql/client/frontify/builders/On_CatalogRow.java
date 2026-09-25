package ch.brix.gql.client.frontify.builders;

public class On_CatalogRow extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogRow() {
    super(new ch.brix.gql.client.On("CatalogRow"));
  }
  /**
   * **BETA** `CatalogRow` ID.
   */
  public On_CatalogRow id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `position` of the `CatalogRow` for ordering.
   */
  public On_CatalogRow position() {
    _add_field("position");
    return this;
  }
  /**
   * **BETA** `Catalog` of the `CatalogRow`.
   */
  public On_CatalogRow catalog(CatalogRow_catalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `cells` of the `CatalogRow`.
   */
  public On_CatalogRow cells(CatalogRow_cells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
