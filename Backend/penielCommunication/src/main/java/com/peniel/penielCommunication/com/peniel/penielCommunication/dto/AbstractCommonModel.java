package com.peniel.penielCommunication.com.peniel.penielCommunication.dto;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;;

@MappedSuperclass
public class AbstractCommonModel {
    /** Id du système. */
    private static final String SYSTEM ="sytem";

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    @Id
    private Long id;

    /** {@link Date} de création de l'entité. */
    @Column(name="hor_creat", nullable = false, length = 18)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    /** Identifiant du créateur de l'entité */
    @Column(name="id_util_creat", nullable = false, length = 18)
    private Long creatorCode;

    /** {@link Date} de la suppression de l'entité. */
    @Column(name="hor_suppr",  length = 18)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDate;

    /** Identifiant de l'utilisateur qui a supprimé (logiquement) l'entité. */
    @Column(name = "id_util_suppr", length = 18)
    private Long deleterCode;

    /** {@link Date} de la dernière mise à jour de l'entité */
    @Column(name = "hor_mise_a_jour" , length = 18)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    /** Identifiant de l'utilisateur qui a mis à jour l'entité pour la dernière fois. */
    @Column(name = "id_util_maj", length = 18)
    private Long updaterCode;

    /** {@link Boolean} indiquant si l'entité est "supprimée" (suppression logique). */
    @Column(name = "boo_suppr", nullable = false)
    private Boolean isDeleted=false;

    /**
     * Permet d'effectuer des actions avant que l'entité ne soit persister.
     */
    @PrePersist
    public void beforePersist() {
        // Si l'objet n'a pas de date de création, il est nouveau donc on lui assigne une date de création
        if(null == creationDate) {
            setCreationDate(Calendar.getInstance().getTime());
        }
    }

    /**
     * Permet d'effectuer des actions avant que l'entité ne soit mis à jour.
     */
    @PreUpdate
    public void beforeUpdate() {
        // On met à jour le champ date de mise à jour

        if(null == updateDate) {
            setUpdateDate(Calendar.getInstance().getTime());
        }
    }
    /**
     * {@inheritDoc}
     */

    /**
     * Getter de {@link AbstractCommonModel#creationDate}.
     *
     * @return la valeur du champ {@link AbstractCommonModel#creationDate}
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Setter de {@link AbstractCommonModel#creationDate}.
     *
     * @param pCreationDate la valeur du champ {@link AbstractCommonModel#creationDate} à "setter".
     */
    public void setCreationDate(Date pCreationDate) {
        if(pCreationDate != null) {
            this.creationDate = new Date(pCreationDate.getTime());
        }else {
            this.creationDate = null;
        }
    }

    /**
     * Getter de {@link AbstractCommonModel #creatorId}.
     *
     * @return la valeur du champ {@link AbstractCommonModel #creatorId}
     */
    public Long getCreatorCode() {
        return creatorCode;
    }

    /**
     * Setter de {@link AbstractCommonModel #creatorId}.
     *
     * @param creatorCode la valeur du champ {@link AbstractCommonModel #creatorId} à "setter".
     */
    public void setCreatorCode(Long creatorCode) {
        this.creatorCode = creatorCode;
    }

    /**
     * Getter de {@link AbstractCommonModel#deleteDate}.
     *
     * @return la valeur du champ {@link AbstractCommonModel#deleteDate}
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * Setter de {@link AbstractCommonModel#deleteDate}.
     *
     * @param pDeleteDate la valeur du champ {@link AbstractCommonModel#deleteDate} à "setter".
     */
    public void setDeleteDate(Date pDeleteDate) {
        if(pDeleteDate != null) {
            this.deleteDate = new Date(pDeleteDate.getTime());
        }else {
            this.deleteDate = null;
        }
    }

    /**
     * Getter de {@link AbstractCommonModel #deletererId}.
     *
     * @return la valeur du champ {@link AbstractCommonModel #deletererId}
     */
    public Long getDeleterCode() {
        return deleterCode;
    }

    /**
     * Setter de {@link AbstractCommonModel #deletererId}.
     *
     * @param deleterCode la valeur du champ {@link AbstractCommonModel #deletererId} à "setter".
     */
    public void setDeleterCode(Long deleterCode) {
        this.deleterCode = deleterCode;
    }

    /**
     * Getter de {@link AbstractCommonModel#updateDate}.
     *
     * @return la valeur du champ {@link AbstractCommonModel#updateDate}
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter de {@link AbstractCommonModel#updateDate}.
     *
     * @param pUpdateDate la valeur du champ {@link AbstractCommonModel#updateDate} à "setter".
     */
    public void setUpdateDate(Date pUpdateDate) {
        if(pUpdateDate != null) {
            this.updateDate = new Date(pUpdateDate.getTime());
        }else {
            this.updateDate = null;
        }
    }
    /**
     * Getter de {@link AbstractCommonModel #updaterId}.
     *
     * @return la valeur du champ {@link AbstractCommonModel #updaterId}
     */

    public Long getUpdaterCode() {
        return updaterCode;
    }
    /**
     * Setter de {@link AbstractCommonModel #updaterId}.
     *
     * @param updaterCode la valeur du champ {@link AbstractCommonModel #updaterId} à "setter".
     */
    public void setUpdaterCode(Long updaterCode) {
        this.updaterCode = updaterCode;
    }

    /**
     * {@inheritDoc}
     */

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
