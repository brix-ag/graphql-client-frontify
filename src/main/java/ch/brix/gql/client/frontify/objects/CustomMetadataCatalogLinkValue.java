package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogLinkValue {
  /**
   * **BETA** Cells readable for the linked row through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("cells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell> cells;
  /**
   * **BETA** Columns readable for the linked row through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("columns")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn> columns;
  /**
   * **BETA** Display value of the linked row readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("displayValue")
  private ch.brix.gql.client.frontify.scalars.StringScalar displayValue;
}
