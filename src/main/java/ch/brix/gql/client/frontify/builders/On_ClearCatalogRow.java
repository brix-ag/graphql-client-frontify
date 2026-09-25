package ch.brix.gql.client.frontify.builders;

public class On_ClearCatalogRow extends ch.brix.gql.client.TypeBuilder {
  public On_ClearCatalogRow() {
    super(new ch.brix.gql.client.On("ClearCatalogRow"));
  }
  /**
   * **BETA** The `CatalogRow` that was just cleared.
   */
  public On_ClearCatalogRow row(ClearCatalogRow_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
