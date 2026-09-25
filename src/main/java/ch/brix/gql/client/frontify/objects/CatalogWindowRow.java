package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogWindowRow {
  /**
   * **BETA** The `CatalogRow` represented by this window row.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
  /**
   * **BETA** Cells corresponding one-to-one, and in the same order, as the containing window columns.
   */
  @com.google.gson.annotations.SerializedName("cells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell> cells;
}
