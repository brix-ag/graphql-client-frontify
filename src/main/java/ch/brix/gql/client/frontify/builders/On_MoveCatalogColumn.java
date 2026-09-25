package ch.brix.gql.client.frontify.builders;

public class On_MoveCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_MoveCatalogColumn() {
    super(new ch.brix.gql.client.On("MoveCatalogColumn"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just moved.
   */
  public On_MoveCatalogColumn column(MoveCatalogColumn_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
