package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogTextColumn implements ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn {
  /**
   * **BETA** Opaque catalog text column ID readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Catalog text column name readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
