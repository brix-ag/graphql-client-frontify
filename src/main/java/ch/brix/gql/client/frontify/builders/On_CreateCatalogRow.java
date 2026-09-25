package ch.brix.gql.client.frontify.builders;

public class On_CreateCatalogRow extends ch.brix.gql.client.TypeBuilder {
  public On_CreateCatalogRow() {
    super(new ch.brix.gql.client.On("CreateCatalogRow"));
  }
  /**
   * **BETA** The `CatalogRow` that was just created.
   */
  public On_CreateCatalogRow row(CreateCatalogRow_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
