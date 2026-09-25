package ch.brix.gql.client.frontify.builders;

public class On_CreateCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CreateCatalogColumn() {
    super(new ch.brix.gql.client.On("CreateCatalogColumn"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just created.
   */
  public On_CreateCatalogColumn column(CreateCatalogColumn_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
