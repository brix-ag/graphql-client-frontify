package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeInput extends ch.brix.gql.client.InputObject {
  /**
   * `CreativeTemplateId` Id.
   */
  public ExportCreativeInput templateId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("templateId", v);
    return this;
  }
  /**
   * `ExportCreativeDestinationInput` where the exported file will be uploaded.
   */
  public ExportCreativeInput destination(ch.brix.gql.client.frontify.input_objects.ExportCreativeDestinationInput v) {
    values.put("destination", v);
    return this;
  }
  /**
   * List of `CreativeVariableInput` which will be applied to the template.
   */
  public ExportCreativeInput variables(java.util.List<ch.brix.gql.client.frontify.input_objects.CreativeVariableInput> v) {
    values.put("variables", v);
    return this;
  }
  /**
   * `ExportCreativeOptionsInput` data.
   */
  public ExportCreativeInput options(ch.brix.gql.client.frontify.input_objects.ExportCreativeOptionsInput v) {
    values.put("options", v);
    return this;
  }
}
