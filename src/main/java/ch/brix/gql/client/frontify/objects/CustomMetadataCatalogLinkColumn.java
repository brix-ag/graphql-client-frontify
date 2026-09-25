package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogLinkColumn implements ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn {
  /**
   * **BETA** Opaque catalog link column ID readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Catalog link column name readable through custom metadata visibility.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
