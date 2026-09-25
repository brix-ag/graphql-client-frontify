package ch.brix.gql.client.frontify.builders;

public class On_Catalog extends ch.brix.gql.client.TypeBuilder {
  public On_Catalog() {
    super(new ch.brix.gql.client.On("Catalog"));
  }
  /**
   * **BETA** `Catalog` id.
   */
  public On_Catalog id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `name` of the `Catalog`.
   */
  public On_Catalog name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** `DateTime` of the `Catalog` creation.
   */
  public On_Catalog createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * **BETA** `DateTime` of the `Catalog` last update.
   */
  public On_Catalog updatedAt() {
    _add_field("updatedAt");
    return this;
  }
  /**
   * **BETA** `rows` of the `Catalog`.
   */
  public On_Catalog rows(Catalog_rows callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `columns` of the `Catalog`.
   */
  public On_Catalog columns(Catalog_columns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A rectangular page of catalog data whose cells correspond to the selected columns. One catalog window can contain at most 2,500 cell coordinates.
   */
  public On_Catalog window(Catalog_window callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Primary `CatalogColumn` of the `Catalog`.
   */
  public On_Catalog primaryColumn(Catalog_primaryColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Fetch cells for a row identified by its primary key value.
   */
  public On_Catalog cellsByPrimaryKey(Catalog_cellsByPrimaryKey callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Get a paginated page of filter values (with counts) for one column. Returns null when the column does not belong to the catalog. Items are ordered by `count DESC, value ASC`.
   */
  public On_Catalog columnFilter(Catalog_columnFilter callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Why this `Catalog` is currently in use, as reason codes. Empty when it is not in use.
   */
  public On_Catalog usageReasons() {
    _add_field("usageReasons");
    return this;
  }
  /**
   * **BETA** Search catalog cells by query and column filters. Query is split by whitespace; each part must match (case-insensitive) in at least one cell per row. Column filters match entire cell values; multiple values for the same column are OR'd, cross-column is AND'd. Results limited to 100 rows.
   */
  public On_Catalog searchCells(Catalog_searchCells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
