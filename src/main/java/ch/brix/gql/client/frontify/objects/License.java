package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class License {
  /**
   * `License` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `License` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * `License` terms.
   */
  @com.google.gson.annotations.SerializedName("license")
  private ch.brix.gql.client.frontify.scalars.StringScalar license;
  /**
   * `License` is applied to new assets by default.
   */
  @com.google.gson.annotations.SerializedName("addByDefault")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar addByDefault;
  /**
   * `License` requires `User` to accept terms before download.
   */
  @com.google.gson.annotations.SerializedName("requireConsensus")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar requireConsensus;
}
