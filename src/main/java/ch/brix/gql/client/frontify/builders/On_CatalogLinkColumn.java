package ch.brix.gql.client.frontify.builders;

public class On_CatalogLinkColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogLinkColumn() {
    super(new ch.brix.gql.client.On("CatalogLinkColumn"));
  }
  /**
   * **BETA** `CatalogColumn` ID.
   */
  public On_CatalogLinkColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `name` of the `CatalogColumn`.
   */
  public On_CatalogLinkColumn name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** `position` of the `CatalogColumn` for ordering.
   */
  public On_CatalogLinkColumn position() {
    _add_field("position");
    return this;
  }
  /**
   * **BETA** The target `Catalog` this column links to.
   */
  public On_CatalogLinkColumn targetCatalog(CatalogLinkColumn_targetCatalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
