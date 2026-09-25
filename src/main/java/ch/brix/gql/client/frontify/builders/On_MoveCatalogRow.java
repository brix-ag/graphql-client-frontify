package ch.brix.gql.client.frontify.builders;

public class On_MoveCatalogRow extends ch.brix.gql.client.TypeBuilder {
  public On_MoveCatalogRow() {
    super(new ch.brix.gql.client.On("MoveCatalogRow"));
  }
  /**
   * **BETA** The `CatalogRow` that was just moved.
   */
  public On_MoveCatalogRow row(MoveCatalogRow_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
