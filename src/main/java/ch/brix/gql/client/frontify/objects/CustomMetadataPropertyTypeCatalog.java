package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyTypeCatalog implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType {
  /**
   * The `CustomMetadataProperty` type name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The `Catalog` linked to this `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("catalog")
  private ch.brix.gql.client.frontify.objects.Catalog catalog;
  /**
   * **BETA** The `CatalogColumn` used for display values.
   */
  @com.google.gson.annotations.SerializedName("displayColumn")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn displayColumn;
  /**
   * **BETA** Whether multiple catalog rows can be selected for this property.
   */
  @com.google.gson.annotations.SerializedName("allowMultiSelect")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar allowMultiSelect;
  /**
   * **BETA** Link column IDs the user may traverse via link expansion.
   */
  @com.google.gson.annotations.SerializedName("allowedLinkedColumnIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> allowedLinkedColumnIds;
}
