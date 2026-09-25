package ch.brix.gql.client.frontify.builders;

public class On_CatalogSelection extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogSelection() {
    super(new ch.brix.gql.client.On("CatalogSelection"));
  }
  /**
   * **BETA** `CatalogSelection` id.
   */
  public On_CatalogSelection id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Root-level entries of the selection tree.
   */
  public On_CatalogSelection entries(CatalogSelection_entries callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
