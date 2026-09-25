package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class FailedAssetUpdate {
  /**
   * **BETA** `Asset` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Whole-asset failure code — none of the entry's changes were applied. `null` when the asset itself was writable and only individual fields failed; see `fieldErrors`.
   */
  @com.google.gson.annotations.SerializedName("code")
  private ch.brix.gql.client.frontify.enums.AssetUpdateFailureCode code;
  /**
   * **BETA** The entry fields that did not apply; every other requested field was applied. An asset whose every requested field failed carries all its field errors and counts as failed.
   */
  @com.google.gson.annotations.SerializedName("fieldErrors")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.AssetFieldError.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.AssetFieldError> fieldErrors;
}
