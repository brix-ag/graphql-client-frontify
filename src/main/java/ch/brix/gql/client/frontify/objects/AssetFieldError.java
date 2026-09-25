package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetFieldError {
  /**
   * **BETA** The input field that did not apply.
   */
  @com.google.gson.annotations.SerializedName("field")
  private ch.brix.gql.client.frontify.enums.AssetUpdateFieldName field;
  /**
   * **BETA** Opaque id of the referenced property, license, or collection. Set only for `CUSTOM_METADATA`, `ADD_LICENSES`, and `ADD_COLLECTIONS` field errors; `null` otherwise.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Why the field did not apply.
   */
  @com.google.gson.annotations.SerializedName("code")
  private ch.brix.gql.client.frontify.enums.AssetUpdateFieldErrorCode code;
}
