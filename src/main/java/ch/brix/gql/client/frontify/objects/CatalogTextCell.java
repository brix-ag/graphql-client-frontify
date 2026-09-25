package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogTextCell implements ch.brix.gql.client.frontify.interfaces.CatalogCell {
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
   * **BETA** `value` of the `CatalogCell`.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
