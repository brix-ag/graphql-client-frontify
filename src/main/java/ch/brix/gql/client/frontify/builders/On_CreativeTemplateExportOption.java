package ch.brix.gql.client.frontify.builders;

public class On_CreativeTemplateExportOption extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeTemplateExportOption() {
    super(new ch.brix.gql.client.On("CreativeTemplateExportOption"));
  }
  /**
   * Allowed format for exporting an `CreativeTemplate`, e.g., JPG.
   */
  public On_CreativeTemplateExportOption format() {
    _add_field("format");
    return this;
  }
}
