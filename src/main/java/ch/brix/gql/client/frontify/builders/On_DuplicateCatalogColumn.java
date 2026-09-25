package ch.brix.gql.client.frontify.builders;

public class On_DuplicateCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_DuplicateCatalogColumn() {
    super(new ch.brix.gql.client.On("DuplicateCatalogColumn"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just duplicated.
   */
  public On_DuplicateCatalogColumn column(DuplicateCatalogColumn_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
