package ch.brix.gql.client.frontify.builders;

public class On_CatalogWindow extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogWindow() {
    super(new ch.brix.gql.client.On("CatalogWindow"));
  }
  /**
   * **BETA** The independently paginated columns represented by this window.
   */
  public On_CatalogWindow columns(CatalogWindow_columns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The independently paginated rows and their cells represented by this window.
   */
  public On_CatalogWindow rows(CatalogWindow_rows callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
