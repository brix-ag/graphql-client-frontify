package ch.brix.gql.client.frontify.builders;

public class On_DuplicateCatalogRow extends ch.brix.gql.client.TypeBuilder {
  public On_DuplicateCatalogRow() {
    super(new ch.brix.gql.client.On("DuplicateCatalogRow"));
  }
  /**
   * **BETA** The `CatalogRow` that was just duplicated.
   */
  public On_DuplicateCatalogRow row(DuplicateCatalogRow_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
