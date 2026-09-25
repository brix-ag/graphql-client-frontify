package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogTextColumn implements ch.brix.gql.client.frontify.interfaces.CatalogColumn {
  /**
   * **BETA** `CatalogColumn` ID.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** `name` of the `CatalogColumn`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** `position` of the `CatalogColumn` for ordering.
   */
  @com.google.gson.annotations.SerializedName("position")
  private ch.brix.gql.client.frontify.scalars.IntScalar position;
}
