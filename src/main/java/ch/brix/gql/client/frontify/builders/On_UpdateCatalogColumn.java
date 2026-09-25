package ch.brix.gql.client.frontify.builders;

public class On_UpdateCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateCatalogColumn() {
    super(new ch.brix.gql.client.On("UpdateCatalogColumn"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just updated.
   */
  public On_UpdateCatalogColumn column(UpdateCatalogColumn_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
