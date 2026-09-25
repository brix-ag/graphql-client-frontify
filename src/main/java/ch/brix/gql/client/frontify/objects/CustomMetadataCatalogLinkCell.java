package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogLinkCell implements ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell {
  /**
   * **BETA** Catalog column of this link cell readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn column;
  /**
   * **BETA** Linked row details readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("links")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataCatalogLinkValue.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataCatalogLinkValue> links;
  /**
   * **BETA** Link display values readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("values")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.StringScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> values;
}
