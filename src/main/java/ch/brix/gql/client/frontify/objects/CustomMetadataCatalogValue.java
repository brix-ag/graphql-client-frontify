package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogValue implements ch.brix.gql.client.frontify.interfaces.CustomMetadata {
  /**
   * **BETA** `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
  /**
   * **BETA** Catalog display column readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("displayColumn")
  private ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn displayColumn;
  /**
   * **BETA** Catalog columns readable for displaying this custom metadata catalog value.
   */
  @com.google.gson.annotations.SerializedName("columns")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn> columns;
  /**
   * **BETA** Selected catalog entries readable for displaying this custom metadata catalog value.
   */
  @com.google.gson.annotations.SerializedName("entries")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataCatalogEntry.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataCatalogEntry> entries;
}
