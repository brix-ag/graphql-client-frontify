package ch.brix.gql.client.frontify.builders;

public class On_CatalogWindowRow extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogWindowRow() {
    super(new ch.brix.gql.client.On("CatalogWindowRow"));
  }
  /**
   * **BETA** The `CatalogRow` represented by this window row.
   */
  public On_CatalogWindowRow row(CatalogWindowRow_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Cells corresponding one-to-one, and in the same order, as the containing window columns.
   */
  public On_CatalogWindowRow cells(CatalogWindowRow_cells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
