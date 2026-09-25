package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateAssets {
  /**
   * **BETA** Outcome of the bulk update. Changes apply independently per asset and per field; a partial failure does not roll back applied changes.
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.enums.UpdateAssetsStatus status;
  /**
   * **BETA** Failures only: an `Asset` absent from this list had every requested change applied in full.
   */
  @com.google.gson.annotations.SerializedName("failedAssets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.FailedAssetUpdate.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.FailedAssetUpdate> failedAssets;
  /**
   * **BETA** `Assets` touched by this mutation, reflecting their state after whatever changes succeeded. Includes assets with field errors, since those were still partially updated; excludes assets present in `failedAssets` with a non-null `code`, since those were not touched at all.
   */
  @com.google.gson.annotations.SerializedName("updatedAssets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> updatedAssets;
}
