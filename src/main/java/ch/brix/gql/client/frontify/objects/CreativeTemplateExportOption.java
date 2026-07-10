package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeTemplateExportOption {
  /**
   * Allowed format for exporting an `CreativeTemplate`, e.g., JPG.
   */
  @com.google.gson.annotations.SerializedName("format")
  private ch.brix.gql.client.frontify.enums.CreativeExportFormat format;
}
