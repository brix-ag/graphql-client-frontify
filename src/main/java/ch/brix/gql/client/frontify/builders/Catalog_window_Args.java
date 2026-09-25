package ch.brix.gql.client.frontify.builders;

public class Catalog_window_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Pagination for the window columns. An omitted or null limit defaults to 10.
   * Default value: { limit: 10, page: 1 }
   */
  public Catalog_window_Args columns(ch.brix.gql.client.frontify.input_objects.CatalogWindowPaginationInput value) {
    _add_arg("columns", value);
    return this;
  }
  /**
   * **BETA** Pagination for the window rows. An omitted or null limit defaults to 25.
   * Default value: { limit: 25, page: 1 }
   */
  public Catalog_window_Args rows(ch.brix.gql.client.frontify.input_objects.CatalogWindowPaginationInput value) {
    _add_arg("rows", value);
    return this;
  }
}
