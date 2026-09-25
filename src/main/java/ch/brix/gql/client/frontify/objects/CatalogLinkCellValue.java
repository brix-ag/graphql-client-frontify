package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogLinkCellValue {
  /**
   * **BETA** Linked target `CatalogRow`.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
  /**
   * **BETA** Display value of the linked target row.
   */
  @com.google.gson.annotations.SerializedName("displayValue")
  private ch.brix.gql.client.frontify.scalars.StringScalar displayValue;
}
