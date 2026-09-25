package ch.brix.gql.client.frontify.builders;

public class Catalog_columnFilter_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Column ID to get filter values for.
   * Default value: null
   */
  public Catalog_columnFilter_Args columnId(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("columnId", value);
    return this;
  }
  /**
   * **BETA** Active column filters for faceted count computation. Filters whose `columnId` matches the argument `columnId` are self-excluded.
   * Default value: null
   */
  public Catalog_columnFilter_Args activeFilters(java.util.List<ch.brix.gql.client.frontify.input_objects.ColumnFilterInput> value) {
    _add_arg("activeFilters", value);
    return this;
  }
  /**
   * **BETA** Search text for faceted filtering (split by whitespace, case-insensitive, matches across all cells of a row).
   * Default value: null
   */
  public Catalog_columnFilter_Args query(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("query", value);
    return this;
  }
  /**
   * **BETA** Case-insensitive substring filter applied to the value strings of the returned items only.
   * Default value: null
   */
  public Catalog_columnFilter_Args columnQuery(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("columnQuery", value);
    return this;
  }
  /**
   * **BETA** Number of items to return per page (max 100).
   * Default value: 100
   */
  public Catalog_columnFilter_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Page number to return (1-indexed).
   * Default value: 1
   */
  public Catalog_columnFilter_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
