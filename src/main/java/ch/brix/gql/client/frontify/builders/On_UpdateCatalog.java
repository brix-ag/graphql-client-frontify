package ch.brix.gql.client.frontify.builders;

public class On_UpdateCatalog extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateCatalog() {
    super(new ch.brix.gql.client.On("UpdateCatalog"));
  }
  /**
   * **BETA** The updated `Catalog`.
   */
  public On_UpdateCatalog catalog(UpdateCatalog_catalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
