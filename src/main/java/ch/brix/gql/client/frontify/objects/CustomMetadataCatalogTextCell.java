package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogTextCell implements ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell {
  /**
   * **BETA** Catalog column of this text cell readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn column;
  /**
   * **BETA** Text cell value readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
