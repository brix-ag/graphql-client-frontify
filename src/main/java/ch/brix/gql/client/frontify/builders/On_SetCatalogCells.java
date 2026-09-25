package ch.brix.gql.client.frontify.builders;

public class On_SetCatalogCells extends ch.brix.gql.client.TypeBuilder {
  public On_SetCatalogCells() {
    super(new ch.brix.gql.client.On("SetCatalogCells"));
  }
  /**
   * **BETA** The `cells` that were just set in the `Catalog`.
   */
  public On_SetCatalogCells cells(SetCatalogCells_cells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
