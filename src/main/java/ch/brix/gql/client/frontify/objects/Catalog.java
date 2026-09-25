package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Catalog implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * **BETA** `Catalog` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** `name` of the `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** `DateTime` of the `Catalog` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * **BETA** `DateTime` of the `Catalog` last update.
   */
  @com.google.gson.annotations.SerializedName("updatedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar updatedAt;
  /**
   * **BETA** `rows` of the `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("rows")
  private ch.brix.gql.client.frontify.objects.CatalogRowItems rows;
  /**
   * **BETA** `columns` of the `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("columns")
  private ch.brix.gql.client.frontify.objects.CatalogColumnItems columns;
  /**
   * **BETA** A rectangular page of catalog data whose cells correspond to the selected columns. One catalog window can contain at most 2,500 cell coordinates.
   */
  @com.google.gson.annotations.SerializedName("window")
  private ch.brix.gql.client.frontify.objects.CatalogWindow window;
  /**
   * **BETA** Primary `CatalogColumn` of the `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("primaryColumn")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn primaryColumn;
  /**
   * **BETA** Fetch cells for a row identified by its primary key value.
   */
  @com.google.gson.annotations.SerializedName("cellsByPrimaryKey")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell> cellsByPrimaryKey;
  /**
   * **BETA** Get a paginated page of filter values (with counts) for one column. Returns null when the column does not belong to the catalog. Items are ordered by `count DESC, value ASC`.
   */
  @com.google.gson.annotations.SerializedName("columnFilter")
  private ch.brix.gql.client.frontify.objects.ColumnFilter columnFilter;
  /**
   * **BETA** Why this `Catalog` is currently in use, as reason codes. Empty when it is not in use.
   */
  @com.google.gson.annotations.SerializedName("usageReasons")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.enums.CatalogUsageReason.class)
  private java.util.List<ch.brix.gql.client.frontify.enums.CatalogUsageReason> usageReasons;
  /**
   * **BETA** Search catalog cells by query and column filters. Query is split by whitespace; each part must match (case-insensitive) in at least one cell per row. Column filters match entire cell values; multiple values for the same column are OR'd, cross-column is AND'd. Results limited to 100 rows.
   */
  @com.google.gson.annotations.SerializedName("searchCells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell> searchCells;
}
