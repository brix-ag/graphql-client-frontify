package ch.brix.gql.client.frontify.builders;

public class Catalog_searchCells_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Search text (will be split by whitespace, case-insensitive).
   * Default value: null
   */
  public Catalog_searchCells_Args query(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("query", value);
    return this;
  }
  /**
   * **BETA** Column filters. Same-column values are OR'd, cross-column is AND'd.
   * Default value: null
   */
  public Catalog_searchCells_Args columnFilters(java.util.List<ch.brix.gql.client.frontify.input_objects.ColumnFilterInput> value) {
    _add_arg("columnFilters", value);
    return this;
  }
  /**
   * **BETA** Column IDs to return cell values for.
   * Default value: null
   */
  public Catalog_searchCells_Args columnIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> value) {
    _add_arg("columnIds", value);
    return this;
  }
}
