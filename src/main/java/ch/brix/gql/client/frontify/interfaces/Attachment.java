package ch.brix.gql.client.frontify.interfaces;

/**
 * `AttachmentInterface` for `Attachment` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.AssetAttachment.class})
public interface Attachment {
  /**
   * `Attachment` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * The `User` who created the `Attachment` on Frontify.
   */
  ch.brix.gql.client.frontify.interfaces.User getCreator();
  /**
   * `DateTime` of the `Attachment` creation.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getCreatedAt();
  /**
   * The `User` who last modified the `Attachment` on Frontify.
   */
  ch.brix.gql.client.frontify.interfaces.User getModifier();
  /**
   * `DateTime` of the `Attachment`'s last modification.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getModifiedAt();
  /**
   * The `Attachment`'s filename.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getFilename();
  /**
   * The `Attachment`'s name or title.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * The `Attachment`'s original file extension.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getExtension();
  /**
   * The `Attachment`'s Media (MIME) type.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getType();
  /**
   * The `Attachment`'s size in bytes.
   */
  ch.brix.gql.client.frontify.scalars.BigIntScalar getSize();
  /**
   * The `Attachment`'s External Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getExternalId();
}
