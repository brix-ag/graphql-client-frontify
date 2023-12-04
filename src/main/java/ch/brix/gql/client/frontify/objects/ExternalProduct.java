package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ExternalProduct {
  /**
   * `External product` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `External product` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `External product` externalId.
   */
  @com.google.gson.annotations.SerializedName("externalId")
  private ch.brix.gql.client.frontify.scalars.IdScalar externalId;
  /**
   * `External product` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
