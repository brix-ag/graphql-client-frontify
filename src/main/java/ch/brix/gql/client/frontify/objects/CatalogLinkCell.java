package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogLinkCell implements ch.brix.gql.client.frontify.interfaces.CatalogCell {
  /**
   * **BETA** `CatalogColumn` of the `CatalogCell`.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
  /**
   * **BETA** `CatalogRow` of the `CatalogCell`.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
  /**
   * **BETA** Linked target rows and their display values for this link cell.
   */
  @com.google.gson.annotations.SerializedName("links")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CatalogLinkCellValue.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CatalogLinkCellValue> links;
}
