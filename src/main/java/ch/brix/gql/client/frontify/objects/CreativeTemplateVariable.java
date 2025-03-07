package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeTemplateVariable {
  /**
   * **BETA** Key of the `CreativeTemplateVariable`.
   */
  @com.google.gson.annotations.SerializedName("key")
  private ch.brix.gql.client.frontify.scalars.StringScalar key;
  /**
   * **BETA** Name of the `CreativeTemplateVariable`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** Description of the `CreativeTemplateVariable`.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * **BETA** Type of the `CreativeTemplateVariable`.
   */
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.enums.CreativeTemplateVariableType type;
  /**
   * **BETA** Value of the `CreativeTemplateVariable`. See `CreativeTemplateVariableType` for valid formats.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.AnyScalar value;
  /**
   * **BETA** Number of template items connected to the `CreativeTemplateVariable`.
   */
  @com.google.gson.annotations.SerializedName("connectionCount")
  private ch.brix.gql.client.frontify.scalars.IntScalar connectionCount;
}
