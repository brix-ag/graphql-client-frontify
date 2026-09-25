package ch.brix.gql.client.frontify.builders;

public class On_ClearCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_ClearCatalogColumn() {
    super(new ch.brix.gql.client.On("ClearCatalogColumn"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just cleared.
   */
  public On_ClearCatalogColumn column(ClearCatalogColumn_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
