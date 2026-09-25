package ch.brix.gql.client.frontify.builders;

public class On_CreateCatalog extends ch.brix.gql.client.TypeBuilder {
  public On_CreateCatalog() {
    super(new ch.brix.gql.client.On("CreateCatalog"));
  }
  /**
   * **BETA** The `Catalog` that was just created.
   */
  public On_CreateCatalog catalog(CreateCatalog_catalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
